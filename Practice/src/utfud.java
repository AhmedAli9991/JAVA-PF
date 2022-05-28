import java.sql.SQLOutput;
import java.util.Scanner;

public class utfud {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String a = "__";
        String b = "__";
        String c = "__";
        String d = "__";
        String e = "__";
        String f = "__";
        String g = "__";
        String h = "__";
        String i = "__";
        System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
        System.out.print("enter position you want to place mark: ");
        int m1 = input.nextInt();
        if (m1 > 10 || m1 < 0)
            System.out.println("ERROR WRONG ENTRY GAME TERMINATED ");
        else {
            switch (m1) {
                case 1:
                    a = "X";
                    break;
                case 2:
                    b = "X";
                    break;
                case 3:
                    c = "X";
                    break;
                case 4:
                    d = "X";
                    break;
                case 5:
                    e = "X";
                    break;
                case 6:
                    f = "X";
                    break;
                case 7:
                    g = "X";
                    break;
                case 8:
                    h = "X";
                    break;
                case 9:
                    i = "X";
                    break;
            }

            System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
            System.out.print("enter position you want to place mark: ");
            int m2 = input.nextInt();
            switch (m2) {
                case 1:
                    a = "O";
                    break;
                case 2:
                    b = "O";
                    break;
                case 3:
                    c = "O";
                    break;
                case 4:
                    d = "O";
                    break;
                case 5:
                    e = "O";
                    break;
                case 6:
                    f = "O";
                    break;
                case 7:
                    g = "O";
                    break;
                case 8:
                    h = "O";
                    break;
                default:
                    i = "O";
            }
            System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
            int m3 = input.nextInt();
            switch (m3) {
                case 1:
                    a = "X";
                    break;
                case 2:
                    b = "X";
                    break;
                case 3:
                    c = "X";
                    break;
                case 4:
                    d = "X";
                    break;
                case 5:
                    e = "X";
                    break;
                case 6:
                    f = "X";
                    break;
                case 7:
                    g = "X";
                    break;
                case 8:
                    h = "X";
                    break;
                default:
                    i = "X";
            }
            System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
            int m4 = input.nextInt();
            switch (m4) {
                case 1:
                    a = "O";
                    break;
                case 2:
                    b = "O";
                    break;
                case 3:
                    c = "O";
                    break;
                case 4:
                    d = "O";
                    break;
                case 5:
                    e = "O";
                    break;
                case 6:
                    f = "O";
                    break;
                case 7:
                    g = "O";
                    break;
                case 8:
                    h = "O";
                    break;
                default:
                    i = "O";
            }
            System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
            int m5 = input.nextInt();
            switch (m5) {
                case 1:
                    a = "X";
                    break;
                case 2:
                    b = "X";
                    break;
                case 3:
                    c = "X";
                    break;
                case 4:
                    d = "X";
                    break;
                case 5:
                    e = "X";
                    break;
                case 6:
                    f = "X";
                    break;
                case 7:
                    g = "X";
                    break;
                case 8:
                    h = "X";
                    break;
                default:
                    i = "X";
            }
            System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
            if (((a=="X"||a=="O")&&(a==b&&a==c))||((d=="X"||d=="O")&&(d==e&&d==f))||((g=="X"||g=="O")&&(g==h&&h==i))||((a=="X"||a=="O")&&(a==e&&a==i))||((c=="X"||c=="O")&&(c==e&&c==g))||((a=="X"||a=="O")&&(a==d&&a==g))||((b=="X"||b=="O")&&(b==e&&b==h))||((c=="X"||c=="O")&&(c==f&&c==i))) 
                System.out.print("you have won");
            else {
                int m6 = input.nextInt();
                switch (m6) {
                    case 1:
                        a = "O";
                        break;
                    case 2:
                        b = "O";
                        break;
                    case 3:
                        c = "O";
                        break;
                    case 4:
                        d = "O";
                        break;
                    case 5:
                        e = "O";
                        break;
                    case 6:
                        f = "O";
                        break;
                    case 7:
                        g = "O";
                        break;
                    case 8:
                        h = "O";
                        break;
                    default:
                        i = "O";
                }
                System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
                if (((a=="X"||a=="O")&&(a==b&&a==c))||((d=="X"||d=="O")&&(d==e&&d==f))||((g=="X"||g=="O")&&(g==h&&h==i))||((a=="X"||a=="O")&&(a==e&&a==i))||((c=="X"||c=="O")&&(c==e&&c==g))||((a=="X"||a=="O")&&(a==d&&a==g))||((b=="X"||b=="O")&&(b==e&&b==h))||((c=="X"||c=="O")&&(c==f&&c==i)))
                    System.out.print("you have won");
                else {
                    int m7 = input.nextInt();
                    switch (m7) {
                        case 1:
                            a = "X";
                            break;
                        case 2:
                            b = "X";
                            break;
                        case 3:
                            c = "X";
                            break;
                        case 4:
                            d = "X";
                            break;
                        case 5:
                            e = "X";
                            break;
                        case 6:
                            f = "X";
                            break;
                        case 7:
                            g = "X";
                            break;
                        case 8:
                            h = "X";
                            break;
                        default:
                            i = "X";
                    }
                    System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
                    if(((a=="X"||a=="O")&&(a==b&&a==c))||((d=="X"||d=="O")&&(d==e&&d==f))||((g=="X"||g=="O")&&(g==h&&h==i))||((a=="X"||a=="O")&&(a==e&&a==i))||((c=="X"||c=="O")&&(c==e&&c==g))||((a=="X"||a=="O")&&(a==d&&a==g))||((b=="X"||b=="O")&&(b==e&&b==h))||((c=="X"||c=="O")&&(c==f&&c==i)))
                        System.out.print("you have won");
                    else {
                        int m8 = input.nextInt();
                        switch (m8) {
                            case 1:
                                a = "O";
                                break;
                            case 2:
                                b = "O";
                                break;
                            case 3:
                                c = "O";
                                break;
                            case 4:
                                d = "O";
                                break;
                            case 5:
                                e = "O";
                                break;
                            case 6:
                                f = "O";
                                break;
                            case 7:
                                g = "O";
                                break;
                            case 8:
                                h = "O";
                                break;
                            default:
                                i = "O";
                        }
                        System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
                        if (((a=="X"||a=="O")&&(a==b&&a==c))||((d=="X"||d=="O")&&(d==e&&d==f))||((g=="X"||g=="O")&&(g==h&&h==i))||((a=="X"||a=="O")&&(a==e&&a==i))||((c=="X"||c=="O")&&(c==e&&c==g))||((a=="X"||a=="O")&&(a==d&&a==g))||((b=="X"||b=="O")&&(b==e&&b==h))||((c=="X"||c=="O")&&(c==f&&c==i)))
                            System.out.print("you have won");
                        else {
                            int m9 = input.nextInt();
                            switch (m9) {
                                case 1:
                                    a = "X";
                                    break;
                                case 2:
                                    b = "X";
                                    break;
                                case 3:
                                    c = "X";
                                    break;
                                case 4:
                                    d = "X";
                                    break;
                                case 5:
                                    e = "X";
                                    break;
                                case 6:
                                    f = "X";
                                    break;
                                case 7:
                                    g = "X";
                                    break;
                                case 8:
                                    h = "X";
                                    break;
                                default:
                                    i = "X";
                            }
                            System.out.println(a + " " + b + " " + c + "\n" + d + " " + e + " " + f + "\n" + g + " " + h + " " + i + "\n");
                            if (((a=="X"||a=="O")&&(a==b&&a==c))||((d=="X"||d=="O")&&(d==e&&d==f))||((g=="X"||g=="O")&&(g==h&&h==i))||((a=="X"||a=="O")&&(a==e&&a==i))||((c=="X"||c=="O")&&(c==e&&c==g))||((a=="X"||a=="O")&&(a==d&&a==g))||((b=="X"||b=="O")&&(b==e&&b==h))||((c=="X"||c=="O")&&(c==f&&c==i)))
                                System.out.print("you have won");
                            else 
                            	System.out.println("It is draw");

                        }
                    }
                }
            }
        }
    }
}