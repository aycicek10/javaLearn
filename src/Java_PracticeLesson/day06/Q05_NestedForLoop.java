package Java_PracticeLesson.day06;

public class Q05_NestedForLoop {
     /*
        Get the number of rows and columns from user.
        Create a rectangle.
        rows = 3 and column = 5 ==> * * * * *
                                    * * * * *
                                    * * * * *
     */
     public static void main(String[] args) {

         for (int i = 1; i <4; i++) {
             for (int j =1 ; j <6 ; j++) {

                 System.out.print( "* " );

             }
             System.out.println();
         }


     }
}
