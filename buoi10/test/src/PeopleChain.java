class PeopleChain {
    Person head = null;

    // Thêm người vào cuối hàng
    void addLast(String name) {
        Person newPerson = new Person(name);
        if (head == null) {
            head = newPerson;
        } else {
            Person current = head;
            while (current.rightHand != null) {
                current = current.rightHand;
            }
            current.rightHand = newPerson;
        }
    }

    // Thêm người vào đầu hàng
    void addFirst(String name) {
        Person newPerson = new Person(name);
        newPerson.rightHand = head;
        head = newPerson;
    }

    // Xoá người đầu hàng
    void removeFirst() {
        if (head != null) {
            head = head.rightHand;
        }
    }

    // Xoá người cuối hàng
    void removeLast() {
        if (head == null || head.rightHand == null) {
            head = null;
            return;
        }
        Person current = head;
        while (current.rightHand.rightHand != null) {
            current = current.rightHand;
        }
        current.rightHand = null;
    }

    // Tìm người trong chuỗi
    boolean contains(String name) {
        Person current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return true;
            }
            current = current.rightHand;
        }
        return false;
    }

    // Hiển thị chuỗi người
    void display() {
        Person current = head;
        System.out.print("Chuỗi người nắm tay: ");
        while (current != null) {
            System.out.print(current.name + " → ");
            current = current.rightHand;
        }
        System.out.println("null");
    }
}

