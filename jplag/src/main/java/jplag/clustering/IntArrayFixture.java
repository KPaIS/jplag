package jplag.clustering;

public class IntArrayFixture {
    IntArray intArray;

    public IntArrayFixture(int length) {
        this.intArray = new IntArray(length);
    }

    public void setFieldWithIndexAndValue(int index, int value) {
        this.intArray.setField(index, value);
    }

    public int getFieldWithIndex(int index) {
        return this.intArray.getFields()[index];
    }
}