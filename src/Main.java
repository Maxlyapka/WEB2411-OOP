import edu.chdtu.web2411.poliakov.lab1.BankStorage;
import edu.chdtu.web2411.poliakov.lab1.accounts.business.BusinessAccount;
import edu.chdtu.web2411.poliakov.lab1.accounts.personal.PersonalAccount;
import edu.chdtu.web2411.poliakov.lab1.enums.AccountType;
import edu.chdtu.web2411.poliakov.lab1.math.TasksMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BankStorage bankStorage = new BankStorage();
//        PersonalAccount personalAccount = new PersonalAccount("Maksym Poliakov", "4000123131230323", 0, 2000);
//        BusinessAccount businessAccount = new BusinessAccount("Maksym Poliakov", "4000123131230323", 1000, "test", 2000, 10);
//        bankStorage.addAccount(personalAccount);
//        bankStorage.addAccount(businessAccount);
//
//        businessAccount.withdrawal(2500);
//        bankStorage.getAllAccounts();
//        businessAccount.calculateInterestRate(30);

        TasksMath tasksMath = new TasksMath();
        int[] numsList = {12, 2, 33, -4, 62, -7, 8, 9};
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(21);
        nums.add(2);
        nums.add(8);

//        ArrayList<Integer> test  = tasksMath.sumArray(list);

//        ArrayList<Integer> test  = tasksMath.arithmeticMean(list);

//        ArrayList<Integer> test = tasksMath.foundMinAndMax(nums);
//        ArrayList<Integer> test = tasksMath.isPrimeNumbers(nums);
//        int test = tasksMath.factorial(6);
//        ArrayList<Integer> test = tasksMath.fibonacciList(10);
//        HashSet<Integer> test = tasksMath.duplicateResolution(nums);
//        int[] test = tasksMath.bubbleSort(numsList);
        ArrayList<Integer> test = tasksMath.findEvenAndOddNums(nums);


        System.out.println(test);
    }
}