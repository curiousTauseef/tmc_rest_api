package com.talend.tmc.services;

public enum Regions {
    AWS_USA_EAST {
        public String toString() {
            return "https://api.us.cloud.talend.com/tmc/v1.3/";
        }
    },
    AWS_EMEA {
        public String toString() {
            return "https://api.eu.cloud.talend.com/tmc/v1.3/";
        }
    },
    AWS_APAC {
        public String toString() {
            return "https://api.ap.cloud.talend.com/tmc/v1.3/";
        }
    },
    AZURE_USA_WEST {
        public String toString() {
            return "https://api.us-west.cloud.talend.com/tmc/v1.3/";
        }
    }
}
