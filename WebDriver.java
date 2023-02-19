package OOPJava;

public interface WebDriver {

        void get(String url);
        void click();
        void sendKeys(String text);
    }

     class ChromeDriver implements WebDriver {
        @Override
        public void get(String url) {
            System.out.println("Opening URL in Chrome: " + url);
        }

        @Override
        public void click() {
            System.out.println("Clicking element in Chrome");
        }

        @Override
        public void sendKeys(String text) {
            System.out.println("Typing in Chrome: " + text);
        }

        public void maximize() {
            System.out.println("Maximizing window in Chrome");
        }
    }

     class FirefoxDriver implements WebDriver {
        @Override
        public void get(String url) {
            System.out.println("Opening URL in Firefox: " + url);
        }

        @Override
        public void click() {
            System.out.println("Clicking element in Firefox");
        }

        @Override
        public void sendKeys(String text) {
            System.out.println("Typing in Firefox: " + text);
        }

        public void clearCache() {
            System.out.println("Clearing cache in Firefox");
        }
    }

     class SafariDriver implements WebDriver {
         @Override
         public void get(String url) {
             System.out.println("Opening URL in Safari: " + url);
         }

         @Override
         public void click() {
             System.out.println("Clicking element in Safari");
         }

         @Override
         public void sendKeys(String text) {
             System.out.println("Typing in Safari: " + text);
         }

         public void disablePopups() {
             System.out.println("Disabling pop-ups in Safari");
         }


     }


