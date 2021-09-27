public class Printer {

    private int numberOfSheetsPaperLeft;

    public Printer(int numberOfSheetsPaperLeft){
        this.numberOfSheetsPaperLeft = numberOfSheetsPaperLeft;
    }


    public int Print(int pages, int copies) {
        return pages * copies;
    }
}
