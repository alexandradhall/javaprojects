package ahall_midweek12;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_midweek12
 * @Date: Apr 7, 2021
 * @Description:
 */
//Imports
//Begin Class AHall_Midweek12
public class AHall_Midweek12 {

    //Begin Main Method
    public static void main(String[] args) {

        File fileDir = new File("C:\test");
        File file = new File("C://test//test.txt");
        if (fileDir.exists()) {
            fileDir.mkdir();
            System.out.println("The directory does not exist.\nCreating directory...");
        } else {
            System.out.printf("The directory does exist at this location: \n%s\n", fileDir.getAbsolutePath());
        }
        if (file.exists()) {
            System.out.println("The file does not exist.\nCreating file...");
            file.createFile();
            System.out.printf("The file now exists and is located here:\n%s\n", file.getAbsolutePath());
        } else {
            System.out.printf("The file already exists and is located here:\n%s\n", file.getAbsolutePath());
        }

        PrintWriter output = new PrintWriter(fileName);
        double amount = 456.73;
        for (int i = 1; i <= 10; i++) {
            output.printf("Account %d:\t $%.2f" + System.getProperty("line.separator"), i, amount += 23.45);
        }
        output.close();

        try (Scanner input = new Scanner(file)) {
            System.out.println("The contents of the file are listed below:");
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }
        input.close();

    } //End Main Method

} //End Class AHall_Midweek12
