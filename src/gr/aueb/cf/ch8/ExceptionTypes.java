package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {

    }

    /**
     * System.in.read() throws IOException.
     * Since a checked exception is thrown, it has to
     * be explicitly to be thrown in method signature.
     * Or has to be caught{} .
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /**
     * If we catch the exception, no need for throws
     * in method signature.
     * The exception does not propagate.
     * If there is a caller, then we have to propagate.
     * If there is a user, we do not propagate the exception.
     * User can have just a message.
     * @return
     */
    public static char readAnotherChar() {
        try{
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /**
     * in this type of method/exception, we take action -- logging.
     * and also rethrow the exception to propagate to the caller
     * @return
     * @throws IOException
     */
    public static char readAgainOneChar() throws IOException {
        try{
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readReadOneChar (char ch) throws IOException, IllegalArgumentException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not found");
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }


//        } catch (IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }
    }
}
