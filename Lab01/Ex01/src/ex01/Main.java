package ex01;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("Enter the square size (1-20): ");
        size = input.nextInt();
        if (size >= 1 && size <= 20) {
            switch (size) {
                case 1:
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("**");
                    System.out.println("**");
                    break;
                case 3:
                    System.out.println("***");
                    System.out.println("* *");
                    System.out.println("***");
                    break;
                case 4:
                    System.out.println("****");
                    System.out.println("*  *");
                    System.out.println("*  *");
                    System.out.println("****");
                    break;
                case 5:
                    System.out.println("*****");
                    System.out.println("*   *");
                    System.out.println("*   *");
                    System.out.println("*   *");
                    System.out.println("*****");
                    break;
                case 6:
                    System.out.println("******");
                    System.out.println("*    *");
                    System.out.println("*    *");
                    System.out.println("*    *");
                    System.out.println("*    *");
                    System.out.println("******");
                    break;
                case 7:
                    System.out.println("*******");
                    System.out.println("*     *");
                    System.out.println("*     *");
                    System.out.println("*     *");
                    System.out.println("*     *");
                    System.out.println("*     *");
                    System.out.println("*******");
                    break;
                case 8:
                    System.out.println("********");
                    System.out.println("*      *");
                    System.out.println("*      *");
                    System.out.println("*      *");
                    System.out.println("*      *");
                    System.out.println("*      *");
                    System.out.println("*      *");
                    System.out.println("********");
                    break;
                case 9:
                    System.out.println("*********");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*********");
                    break;
                case 10:
                    System.out.println("**********");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("*        *");
                    System.out.println("**********");
                    break;
                case 11:
                    System.out.println("***********");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("***********");
                    break;
                case 12:
                    System.out.println("************");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("*          *");
                    System.out.println("************");
                    break;
                case 13:
                    System.out.println("*************");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*           *");
                    System.out.println("*************");
                    break;
                case 14:
                    System.out.println("**************");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("*            *");
                    System.out.println("**************");
                    break;
                case 15:
                    System.out.println("***************");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("*             *");
                    System.out.println("***************");
                    break;
                case 16:
                    System.out.println("****************");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("*              *");
                    System.out.println("****************");
                    break;
                case 17:
                    System.out.println("*****************");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*               *");
                    System.out.println("*****************");
                    break;
                case 18:
                    System.out.println("******************");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("*                *");
                    System.out.println("******************");
                    break;
                case 19:
                    System.out.println("*******************");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*                 *");
                    System.out.println("*******************");
                    break;
                case 20:
                    System.out.println("********************");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("*                  *");
                    System.out.println("********************");
                    break;
            }
        } else {
            System.out.println("Please enter a valid size.");
        }
    }
}
