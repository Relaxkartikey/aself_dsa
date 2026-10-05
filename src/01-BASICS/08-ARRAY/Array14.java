// Practice


void main () {

    int[] arr = {10,20,30,40,50,70,90,112,43};

    int max = arr[0];
    int secondMax = arr[0];


    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            secondMax = max;
            max = arr[i];

            }

    }

    System.out.println(max);
    System.out.println(secondMax);
}


