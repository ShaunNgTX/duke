public class Duke {
    /**
     * Todo: store/read filePath and print list or something.
     */
    public Duke(String filePath) {

        new DataForDuke(filePath);
    }
    
    /**
     * Function to run the file upon opening.
     */
    public void run() {
        //...        
    }

    /**
     * Todo: do try and except here to see if duke file is empty.
     */
    public static void main(String[]args) {
        new Duke("C:\\Users\\shaun\\Documents\\GitHub\\duke\\data\\duke.txt").run();
    }
}

