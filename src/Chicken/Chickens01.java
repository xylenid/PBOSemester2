package Chicken;
public class Chickens01 {
    public static void main(String[] args) {
//Sekenario ke 1
        int eggsPerChicken1 = 5;
        int chickenCount1 = 3;
        int totalEggs1 = 0;

        totalEggs1 += eggsPerChicken1 * chickenCount1;
        chickenCount1++;
        totalEggs1 += eggsPerChicken1 * chickenCount1;
        chickenCount1 /= 2;
        totalEggs1 += eggsPerChicken1 * chickenCount1;
//Sekenario ke 2
        int eggsPerChicken2 = 4;
        int chickenCount2 = 8;
        int totalEggs2 = 0;

        totalEggs2 += eggsPerChicken2 * chickenCount2;
        chickenCount2++;
        totalEggs2 += eggsPerChicken2 * chickenCount2;
        chickenCount2 /= 2;
        totalEggs2 += eggsPerChicken2 * chickenCount2;

        System.out.println("Total telur yang dikumpulkan dari hari Senin hingga Rabu untuk skenario 1 : " + totalEggs1);
        System.out.println("Total telur yang dikumpulkan dari hari Senin hingga Rabu untuk skenario 2 : " + totalEggs2);
    }
}
