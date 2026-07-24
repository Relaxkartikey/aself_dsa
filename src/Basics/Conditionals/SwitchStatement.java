void main() {



    /*
Switch Statement

Syntax:

switch(expression){
    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    default:
        // Code
}

Note:
- Used when comparing one variable with multiple fixed values.
- 'break' exits the switch.
- 'default' executes if no case matches.
*/



    Scanner sc = new Scanner(System.in);
    int DayCount = sc.nextInt();

    switch (DayCount) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;

        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid Day Count");
    }

}