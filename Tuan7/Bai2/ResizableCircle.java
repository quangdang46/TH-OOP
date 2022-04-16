public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {

    }
    @Override
    public int resize(int percent) {
        return (int)this.radius*percent;
    }
}
