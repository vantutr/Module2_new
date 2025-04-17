public class DirectionMaterial {
    private Material[] materials = new Material[100];
    private int count = 0;

    public void addMaterial(Material material) {
        if (count < materials.length) {
            materials[count] = material;
            count++;
        } else {
            System.out.println("Danh sách đã đầy!");
        }
    }

    public void updateMaterial(String id, Material newMaterial) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                materials[i] = newMaterial;
                return;
            }
        }
    }
    public boolean checkIdExistence(String id) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void deleteMaterial(String id) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    materials[j] = materials[j + 1];
                }
                materials[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Không tìm thấy vật liệu có ID: " + id);
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            Material m = materials[i];
            System.out.print("ID: " + m.getId() + "\t" +
                    "| \tTên: " + m.getName() + "\t" +
                    "| \tHSD: " + m.getExpiryDate() + "\t" +
                    "| \tGiá: " + m.getCost() + "\t");

            if (m instanceof CrispyFlour) {
                CrispyFlour crispyFlour = (CrispyFlour) m;
                System.out.print("| \tSố lượng: " + crispyFlour.getQuantity() + "\t");
            } else if (m instanceof Meat) {
                Meat meat = (Meat) m;
                System.out.print("| \tTrọng lượng: " + meat.getWeight() + "\t");
            }

            System.out.println("| \tGiá sau giảm: " + ((Discount) m).getRealMoney());
        }
    }


    public void calculateDiscountDifference() {
        double totalOriginal = 0;
        double totalDiscounted = 0;
        for (int i = 0; i < count; i++) {
            totalOriginal += materials[i].getAmount();
            totalDiscounted += ((Discount)materials[i]).getRealMoney();
        }
        System.out.println("\nTổng giá gốc: " + totalOriginal);
        System.out.println("Tổng giá sau giảm: " + totalDiscounted);
        System.out.println("Chênh lệch: " + (totalOriginal - totalDiscounted));
    }
}

