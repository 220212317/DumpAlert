package za.ac.cput.factory;

import za.ac.cput.entity.ContactDetails;

public class ContactDetailsFactory {

        public static ContactDetails createContactDetails(
                String contactId,
                String cellphoneNumber,
                String emergencyContactNumber,
                String emergencyContactName) {

            return new ContactDetails.Builder()
                    .setContactId(contactId)
                    .setCellphoneNumber(cellphoneNumber)
                    .setEmergencyContactNumber(emergencyContactNumber)
                    .setEmergencyContactName(emergencyContactName)
                    .build();
        }
    }

