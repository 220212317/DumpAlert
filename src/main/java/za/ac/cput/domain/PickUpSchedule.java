package za.ac.cput.domain;

public class PickUpSchedule {

        private String scheduleId;
        private String collectionDay;
        private String collectionTime;
        private String area;
        private boolean reminderEnabled;

        private PickUpSchedule(Builder builder) {
            this.scheduleId = builder.scheduleId;
            this.collectionDay = builder.collectionDay;
            this.collectionTime = builder.collectionTime;
            this.area = builder.area;
            this.reminderEnabled = builder.reminderEnabled;
        }

        public String getScheduleId() {
            return scheduleId;
        }

        public String getCollectionDay() {
            return collectionDay;
        }

        public String getCollectionTime() {
            return collectionTime;
        }

        public String getArea() {
            return area;
        }

        public boolean isReminderEnabled() {
            return reminderEnabled;
        }

        public static class Builder {

            private String scheduleId;
            private String collectionDay;
            private String collectionTime;
            private String area;
            private boolean reminderEnabled;

            public Builder setScheduleId(String scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            public Builder setCollectionDay(String collectionDay) {
                this.collectionDay = collectionDay;
                return this;
            }

            public Builder setCollectionTime(String collectionTime) {
                this.collectionTime = collectionTime;
                return this;
            }

            public Builder setArea(String area) {
                this.area = area;
                return this;
            }
            public Builder setReminderEnabled(boolean reminderEnabled) {
                this.reminderEnabled = reminderEnabled;
                return this;
            }

            public PickUpSchedule build() {
                return new PickUpSchedule(this);
            }
        }
    }
