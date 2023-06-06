public class switch1 {
        public static void main(String[] args) {
            int a = 2 < 3 ? 2 : 3; //Đây là một biểu thức gán giá trị cho biến a sử dụng toán tử điều kiện ? :. Biểu thức 2 < 3 được kiểm tra và vì điều kiện này đúng, giá trị được trả về sau dấu ? là 2, nên biến a được gán giá trị là 2.

            switch(a) {
                case 1:
                    System.out.print("A");
                    break;
                case 2: // Nếu giá trị của biến a bằng 2, câu lệnh System.out.print("B") sẽ được thực hiện
                    System.out.print("B");
                    // Không có câu lệnh break ở đây
                default: // tiếp tục thực hiện
                    System.out.print("C");
            }
        }

}
