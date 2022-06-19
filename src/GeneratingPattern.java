
    public class GeneratingPattern {
        public static boolean combination_finding(int[] abc) {
            int yy = abc.length;
            int i = yy - 1;
            while (i > 0) {
                if (abc[i - 1] < abc[i]) {
                    break;
                }
                i--;

            }

            if (i <= 0) {
                return false;
            }
            int j = yy - 1;
            while (j >= i) {
                if (abc[i - 1] < abc[j]) {
                    break;
                }
                j--;
            }
            swap(i - 1, j, abc);
            yy--;
            while (i < yy) {
                swap(i, yy, abc);
                yy--;
                i++;
            }
            return true;
        }

        public static void swap(int x, int y, int[] abc) {
            int temp = abc[x];
            abc[x] = abc[y];
            abc[y] = temp;
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            do {
                int q, w, e;
                q = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
                w = a[4];
                e = a[5] * 1000 + a[6] * 100 + a[7] * 10 + a[8];
                if (q == w * e) {
                    System.out.println(w + " x " + e + " = " + q);
                }
                int x = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
                int y = a[4] * 10 + a[5];
                int z = a[6] * 100 + a[7] * 10 + a[8];
                if (x == y * z) {
                    System.out.println(y + " x " + z + " = " + x);
                }
            } while (combination_finding(a));

        }

    }


