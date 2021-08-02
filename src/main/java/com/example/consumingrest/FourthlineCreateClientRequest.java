package com.example.consumingrest;


public class FourthlineCreateClientRequest {

    private String providerClientId;
    private ClientData clientData;
    private Address address;
    private Document document;

    public FourthlineCreateClientRequest(String providerClientId,
        String firstname,
        String lastName,
        String nationality,
        String gender,
        String countryOfBirth,
        String placeOfBirth,
        String birthDate,
        String city,
        String country,
        String documentNumber) {

        this.providerClientId = providerClientId;

        this.clientData = new ClientData();
        this.clientData.setFirstName(firstname);
        this.clientData.setLastName(lastName);
        this.clientData.setNationality(nationality);
        this.clientData.setGender(gender);
        this.clientData.setCountryOfBirth(countryOfBirth);
        this.clientData.setPlaceOfBirth(placeOfBirth);
        this.clientData.setBirthDate(birthDate);

        this.address = new Address();
        this.address.setCity(city);
        this.address.setCountry(country);

        this.document = new Document();
        this.document.setDocumentNumber(documentNumber);
    }

    public String getProviderClientId() {
        return providerClientId;
    }

    public void setProviderClientId(String providerClientId) {
        this.providerClientId = providerClientId;
    }

    public static class ClientData {
        private String firstName;
        private String lastName;
        private String nationality;
        private String gender;
        private String countryOfBirth;
        private String placeOfBirth;
        private String birthDate;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getCountryOfBirth() {
            return countryOfBirth;
        }

        public void setCountryOfBirth(String countryOfBirth) {
            this.countryOfBirth = countryOfBirth;
        }

        public String getPlaceOfBirth() {
            return placeOfBirth;
        }

        public void setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }
    }

    public static class Address {
        private String city;
        private String country;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public static class Document {
        private String documentNumber;

        public String getDocumentNumber() {
            return documentNumber;
        }

        public void setDocumentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
        }
    }
}



