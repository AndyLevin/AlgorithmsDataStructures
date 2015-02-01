class MyArray {

    int[] array;

    MyArray(int n) {
        array = new int[n];
    }

    public void fillIn() {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {


        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        }
    }

    public void selectionSort() {
        int nElems = array.length;

        for (int i = 0; i < nElems - 1; i++) {

            int minPosition = i;

            for (int j = i + 1; j < nElems; j++) {

                if (array[j] < array[minPosition]) {
                    minPosition = j;

                }
            }
            int temp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = temp;

        }
    }

    public void insertionSort() {
        int curElem;
        int curPos;
        int nElems = array.length;

        for (int out = 1; out < nElems; out++) {
            curElem = array[out];
            curPos = out;
            if (curElem > array[out - 1])
                continue;
            else {
                for (int in = out; in > 0; in--) {
                    if (curElem < array[in - 1]) {
                        array[in] = array[in - 1];
                        curPos = in - 1;
                    } else break;
                }


                array[curPos] = curElem;
            }
        }

    }

    public void oddEvenSort() {
        int nElems = array.length;

        for(int i = 0; i < nElems; i ++)
        {
            for(int j=0; j < nElems-1; j+=2)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

            for(int j=1; j < nElems-1; j+=2)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}