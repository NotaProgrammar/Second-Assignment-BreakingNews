package AP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Infrastructure infrastructure = new Infrastructure("2a69589baf8b4a08bd98c80ad2e332d5");
        infrastructure.displayNewsList();
        ArrayList<News> NewsList = infrastructure.getNewsList();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int ArticleNumber = scanner.nextInt();
            if(ArticleNumber == -1) {
                break;
            }
            NewsList.get(ArticleNumber-1).DisplayNews();
            System.out.println("-------------------------");
        }

    }
}