import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Txt_to_WordIndex {
    static int found=0;
    static ArrayList<node> WordIndex;
    static {

        File file = new File("C:\\Users\\abotl\\OneDrive\\Desktop\\alice_in_wonderland.txt");
        try {
            String line ;
            int count=0;
            String [] words=new String[100];
            Scanner sc = new Scanner(file);
             WordIndex = new ArrayList<>(1000);
            while(sc.hasNext()) {
             line=sc.nextLine();
             count++;
             words = line.split(" ");
                for (String word:words) {
                node e =  new node();
                e.book_name="alice_in_wonderland";
                e.line_num=count;
                e.word = word;
                WordIndex.add(e);


                }


            }
        }catch(FileNotFoundException fe){
            found=1;
        }


    }
    static class node{
        String word;
        String book_name;
        int line_num;

        public void setWord(String word) {
            this.word = word;
        }

        public void setBook_name(String book_name) {
            this.book_name = book_name;
        }

        public void setLine_num(int line_num) {
            this.line_num = line_num;
        }
         public void display(){
            System.out.println(word+", "+book_name+" ,"+line_num);
         }

    }
}
