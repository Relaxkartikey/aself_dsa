void main() {

    /*
Switch Expression (Java 14+)

Syntax:

result = switch(expression){
    case value1 -> result1;
    case value2 -> result2;
    default -> defaultResult;
};

Note:
- Uses -> instead of :
- No break required.
- Returns a value.
- Cleaner and safer than traditional switch.
*/
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();

    String day = switch(num){
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        default -> "Invalid";
    };

    System.out.println(day);
        }