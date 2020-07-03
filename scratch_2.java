import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfstudent=scanner.nextInt();
        int numOfQuestion = scanner.nextInt();
        String[] anwsers = new String[numOfstudent];
        int[] weights = new int[numOfQuestion];
        int result =0;
        for(int i =0;i<numOfstudent;i++){
            anwsers[i] = scanner.next();
        }
        for(int i =0;i<numOfQuestion;i++){
            weights[i] = scanner.nextInt();
        }

        for(int i=0;i<numOfQuestion;i++){
            int[][] record = new int[numOfQuestion][5];
            int numOfDiffAnwsers = 0;
            for(int j =0;j<numOfstudent;j++){
                char input = anwsers[j].charAt(i);
                int anw = input-'A';
                record[i][anw]++;
            }
            int max = 0;
            for(int j = 0;j<5;j++){
                if(record[i][j]>=max){
                    max = record[i][j];
                }
            }
            result+= weights[i]*max;
        }

        System.out.println(result);
    }

}