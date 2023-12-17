package Week5;

public class week005 {

	    public interface Logger {
	        void log(String message);
	        void error(String message);
	    }

	    public static class ConcreteAsteriskLogger extends AsteriskLogger{
	    }

	    public static class ConcreteSpacedLogger extends SpacedLogger {
	    }

	    public abstract static class AsteriskLogger implements Logger {
	        @Override
	        public void log(String message) {
	            System.out.println("***" + message + "***");
	        }

	        @Override
	        public void error(String message) {
	            System.out.println("*****************");
	            System.out.println("***Error: " + message + "***");
	            System.out.println("*****************");
	        }
	    }

	    public abstract static class SpacedLogger implements Logger {
	        @Override
	        public void log(String message) {
	            for (char c : message.toCharArray()) {
	                System.out.print(c + " ");
	            }
	            System.out.println();
	        }

	        @Override
	        public void error(String message) {
	            System.out.println("Error: ");
	            for (char c : message.toCharArray()) {
	                System.out.print(c + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static class App {
	        public static void main(String[] args) {
	            ConcreteAsteriskLogger concreteAsteriskLogger = new ConcreteAsteriskLogger();
	            ConcreteSpacedLogger concreteSpacedLogger = new ConcreteSpacedLogger();

	            concreteAsteriskLogger.log("Hello");
	            concreteSpacedLogger.log("Hello");
	        }
	    }
	}
