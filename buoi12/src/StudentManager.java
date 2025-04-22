public class StudentManager {
    private Node root;

    // Thêm sinh viên vào cây
    public void addStudent(int id, String name) {
        Student student = new Student(id, name);
        root = insert(root, student);
    }

    // In danh sách sinh viên theo mã số
    public void displayStudents() {
        System.out.println("Danh sách sinh viên (theo mã số):");
        inorder(root);
    }

    // Tìm kiếm sinh viên theo ID
    public void findStudent(int id) {
        Student s = search(root, id);
        if (s != null)
            System.out.println("Tìm thấy: " + s);
        else
            System.out.println("Không tìm thấy sinh viên với ID: " + id);
    }

    // ==== Các phương thức xử lý cây BST (private) ====

    private Node insert(Node node, Student student) {
        if (node == null) return new Node(student);  // Khi cây trống (null), trả về nút mới

        if (student.id < node.data.id)
            node.left = insert(node.left, student);  // Nếu ID nhỏ hơn, thêm vào nhánh trái
        else if (student.id > node.data.id)
            node.right = insert(node.right, student);  // Nếu ID lớn hơn, thêm vào nhánh phải

        return node;  // Trả lại nút hiện tại
    }


    private Student search(Node node, int id) {
        if (node == null) return null;
        if (id == node.data.id) return node.data;
        if (id < node.data.id) return search(node.left, id);
        else return search(node.right, id);
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
}
