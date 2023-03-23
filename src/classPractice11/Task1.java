package classPractice11;

public class Task1 {
    public static void main(String[] args) {
        /* Create a 2D array(shorter way) in which first array will consist of 4 names and second array
        will contain grades. Then your program should print name of the students that has A and B grade (edited)
                [10:00 PM]*/

       /* String [][] names={{"Arsalan","Shadoo","Akther Lawa","Saud"},
        {'C','B','B','A'}};
        for (int i = 0; i < names.length; i++) {
           // if(names=='A')
            grades.equals('A');grades.equals('B');{
                System.out.println(names.length+grades.length);

                System.out.println(names[i]);

            }
            


        }*/
        String name [][]={{"Arshad","Saud","Namroz","Shahroz"},
                {"A","B","C","D"}};
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                if(name[i][j].equals("A")||name[i][j].equals("B")){
                    System.out.println(name[0][j]);
                    System.out.println(name[i][j]);
                }


            }

        }
    }
}
