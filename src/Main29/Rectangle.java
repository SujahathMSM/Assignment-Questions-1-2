package Main29;

class Rectangle {
    private float Length = 1.0F;
    private float Width = 1.0F;

    public void setLength(float length) {
        if (length > 0.0 && length < 20.0) {
            this.Length = length;
        } else {
            System.out.println("Invalid Length");
        }
    }

    public void setWidth(float width) {
        if (width > 0.0 && width < 20.0) {
            this.Width = width;
        } else {
            System.out.println("Invalid Width");
        }
    }

    public float getLenght() {
        return this.Length;
    }

    public float getWidth() {
        return this.Width;
    }

    public float getArea() {
        float area = this.Length * this.Width;
        return area;
    }

    public float getPeri() {
        float peri = (2*this.Length) + (2*this.Width);
        return peri;
    }

}
