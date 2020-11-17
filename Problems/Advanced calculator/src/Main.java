

/* Please, do not rename it */
class Problem {


    public static void main(String[] args) {
        String operator = args[0];
        long[] answer = new long[args.length - 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Long.parseLong(args[i + 1]);
        }
        switch (operator) {
            case "MAX":
                long max = answer[0];
                for (int i = 1; i < answer.length; i++) {
                    if (answer[i] > max) {
                        max = answer[i];
                    }
                }
                System.out.println(max);
                break;
            case "MIN":
                long min = answer[0];
                for (int i = 1; i < answer.length; i++) {
                    if (answer[i] < min) {
                        min = answer[i];
                    }
                }
                System.out.println(min);
                break;
            case "SUM":
                long sum = 0;
                for (int i = 0; i < answer.length; i++) {
                    sum += answer[i];
                }
                System.out.println(sum);
                break;
            default:
                break;

        }
    }
}

/*
    public static long max(long[] array) {
        long max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static long min(long[] array) {
        long min = array[0];
        System.out.println(min);
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static long sum(long[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static long[] fromStringToLong(String[] str) {
        long[] answer = new long[str.length - 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Long.parseLong(str[i + 1]);
        }
        return answer;
    }*/