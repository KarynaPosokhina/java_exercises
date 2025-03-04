package fact.it.exline.model;

    public class Line {
        private int beginningX;
        private int beginningY;
        private int endX;
        private int endY;
        private int thickness;


        public Line() {
            this.beginningX = 5;
            this.beginningY = 5;
            this.endX = 5;
            this.endY = 35;
            this.thickness = 1;
        }

        public int getBeginningX() {
            return beginningX;
        }

        public void setBeginningX(int beginningX) {
            this.beginningX = beginningX;
        }

        public int getBeginningY() {
            return beginningY;
        }

        public void setBeginningY(int beginningY) {
            this.beginningY = beginningY;
        }

        public int getEndX() {
            return endX;
        }

        public void setEndX(int endX) {
            this.endX = endX;
        }

        public int getEndY() {
            return endY;
        }

        public void setEndY(int endY) {
            this.endY = endY;
        }

        public int getThickness() {
            return thickness;
        }

        public void setThickness(int thickness) {
            this.thickness = thickness;
        }

        public void makeThinner() {
            if (thickness > 1) {
                thickness--;
            }
        }

        public void makeThicker() {
            thickness++;
        }

        public String showCharacteristics() {
            return "Line starts at (" + beginningX + "," + beginningY + "), " +
                    "line ends at (" + endX + "," + endY + ") " +
                    "and the thickness is: " + thickness;
        }
    }