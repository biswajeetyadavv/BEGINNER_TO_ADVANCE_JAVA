package CA1;

public class OPERATORS {
    public static void main(String args[]){
//              Relational operators
//        operators like i. equal to, ii.less then, iii. grater then
//        iv. less than equal to , v. greater then equal to

        int a = 10;
        int b = 13;

        // greater than example
        if (a > b)
            System.out.println("a is greater than b\n");
        else
            System.out.println("a is less than or equal to b\n");

        // greater than equal to
        if (a >= b)
            System.out.println("a is greater than or equal to b\n");
        else
            System.out.println("a is lesser than b\n");

        // less than example
        if (a < b)
            System.out.println("a is less than b\n");
        else
            System.out.println("a is greater than or equal to b\n");

        // lesser than equal to
        if (a <= b)
            System.out.println("a is lesser than or equal to b\n");
        else
            System.out.println("a is greater than b\n");

        // equal to
        if (a == b)
            System.out.println("a is equal to b\n");
        else
            System.out.println("a and b are not equal\n");

        // not equal to
        if (a != b)
            System.out.println("a is not equal to b\n");
        else
            System.out.println("a is equal b\n");


    }

    public static void logical(String args[]){

//        LOGICAL OPERATORS
//        if you have done electrical or electronic subject
//        its like i.AND, ii.OR, iii.NOT

//        AND operators can be denoted as (&&)
//        here, when we use AND operators there are few rules
//        (34 > 14)(operants)  &&(operator)  (14< 34)(operants)

//        if both the operants are true then only AND operator will
//        return True else, false.

        int a = 12;
        int b = 13;

        if((a>b) && (b<a)){
            System.out.println("its correct true");
        }

//        OR OPERATOR it's denoted as (||)
//        in OR operator if one of the operants is true.
//        then it is true.

        if((a>b) || (b>a)){
            System.out.println("its correct true");
        }

//        NOT OPERATOR it's denotes as (!)
//        in not operator it tells thing is not happening.
//        like a = 2 b = 3
//        normaly we say (a>b) also, it true.
//        !(a>b) it tels the not a>b means a is not greater then b.
//        is it correct? No, so it will return False.

//        to make it true following code.
        if(!(b<a)){
            System.out.println("its correct true");
        }


    }
}
