public class Implement_prority_schedule {
    public static void main(String args[]) {
        int bt[] = { 20, 60, 40, 50, 10 };
        int at[] = { 0, 2, 1, 1, 3 };
        char ps[] = { 'A', 'B', 'C', 'D', 'E' };
        int arr[] = new int[5];
        int tat[] = new int[5];
        int twt[] = new int[5];
        int pt[] = { 2, 3, 1, 4, 2 };
        int y = 0;
        // queue <Character> q=new Queue<>();

        // int sum=0;
        int a;
        // for(a=0;a<6;a++)
        // {
        // sum=sum+at[a];
        // }

        for (a = 0; a < 5; a++) {
            for (int j = a + 1; j < 5; j++) {
                if (at[a] > at[j]) {
                    int temp = at[a];
                    at[a] = at[j];
                    at[j] = temp;

                    temp = pt[a];
                    pt[a] = pt[j];
                    pt[j] = temp;

                    char temp2 = ps[a];
                    ps[a] = ps[j];
                    ps[j] = temp2;
                } else if (at[a] == at[j]) {

                    if (pt[a] > pt[j]) {
                        int temp = at[a];
                        at[a] = at[j];
                        at[j] = temp;

                        temp = pt[a];
                        pt[a] = pt[j];
                        pt[j] = temp;

                        char temp2 = ps[a];
                        ps[a] = ps[j];
                        ps[j] = temp2;
                    } else if (pt[a] == pt[j]) {
                        if (bt[a] < bt[j]) {

                            int temp = at[a];
                            at[a] = at[j];
                            at[j] = temp;

                            temp = pt[a];
                            pt[a] = pt[j];
                            pt[j] = temp;

                            char temp2 = ps[a];
                            ps[a] = ps[j];
                            ps[j] = temp2;

                        }

                    }
                }
            }
        }
        for (a = 1; a < 5; a++)
            for (int j = a + 1; j < 5; j++) {
                if (at[a] < bt[0]) {
                    if (pt[a] > pt[j]) {
                        int temp = at[a];
                        at[a] = at[j];
                        at[j] = temp;

                        temp = pt[a];
                        pt[a] = pt[j];
                        pt[j] = temp;

                        char temp2 = ps[a];
                        ps[a] = ps[j];
                        ps[j] = temp2;
                    }
                } else {
                    y = a;
                }

            }
        for (a = 0; a < 6; a++) {

        }
        int sum = 0;
        for (a = 0; a < 5; a++) {

            sum = sum + bt[a];
            arr[a] = sum;
        }
        for (a = 0; a < 5; a++) {

            tat[a] = arr[a] - at[a];

        }
        for (a = 0; a < 5; a++) {

            twt[a] = tat[a] - bt[a];

        }

        System.out.println("Process" + " ||  " + " " + "Total Arival Time" + " || " + "Total Waiting Time" + " || "
                + " Turn Around Time");
        for (a = 0; a < 5; a++) {

            System.out.println("  " + ps[a] + "               " + " " + tat[a] + "                   " + twt[a]
                    + "                   " + arr[a]);

        }
    }
}