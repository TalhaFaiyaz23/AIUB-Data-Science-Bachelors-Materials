package File;
import Entity.Member;
import java.io.*;

public class FileIO {
    private static  String FILE_PATH = "File/member.txt";

    public static void saveMember(Member member) {
        try {
            File file = new File(FILE_PATH);
            System.out.println("Saving to: " + file.getAbsolutePath());

            File parentDir = file.getParentFile();
            if (!parentDir.exists()) {
                parentDir.mkdirs();
            }if (!file.exists()) {
                file.createNewFile();
            } try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write(member.toFileFormat());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String searchMemberById(String memberId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts[0].equals(memberId)) {
                    StringBuilder result = new StringBuilder();
                    result.append("Member ID: ").append(parts[0]).append("\n")
                            .append("Name: ").append(parts[1]).append("\n")
                            .append("Age: ").append(parts[2]).append("\n")
                            .append("Phone: ").append(parts[3]).append("\n")
                            .append("Gender: ").append(parts[4]).append("\n")
                            .append("Shift: ").append(parts[5]).append("\n")
                            .append("Payment: ").append(parts[6]).append("\n");

                    if (parts.length >= 8) {
                        result.append("Trainer: ").append(parts[7]).append("\n");
                    } else {
                        result.append("Trainer: Not assigned\n");
                    }
                    return result.toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Member not found.";
    }

    public static boolean removeMemberById(String memberId) {
        File inputFile = new File(FILE_PATH);
        File tempFile = new File("File/temp.txt");
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (!parts[0].equals(memberId)) {
                    writer.write(line);
                    writer.newLine();
                } else {
                    found = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (found) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
        }
        return found;
    }

    public static String readAllMembers() {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                data.append("Member ID: ").append(parts[0]).append("\n")
                        .append("Name: ").append(parts[1]).append("\n")
                        .append("Age: ").append(parts[2]).append("\n")
                        .append("Phone: ").append(parts[3]).append("\n")
                        .append("Gender: ").append(parts[4]).append("\n")
                        .append("Shift: ").append(parts[5]).append("\n")
                        .append("Payment: ").append(parts[6]).append("\n");

                if (parts.length >= 8) {
                    data.append("Trainer: ").append(parts[7]).append("\n");
                } else {
                    data.append("Trainer: Not assigned\n");
                }
                data.append("--------------------------------------------------\n");
                data.append("--------------------------------------------------\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }


    public static boolean assignTrainerToMember(String memberId, String trainerName) {
        File inputFile = new File(FILE_PATH);
        File tempFile = new File("File/temp.txt");
        boolean updated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts[0].equals(memberId)) {

                    line = line + ";" + trainerName;
                    updated = true;
                }
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (updated) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
        }
        return updated;
    }



}

