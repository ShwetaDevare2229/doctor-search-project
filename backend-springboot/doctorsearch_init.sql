CREATE DATABASE IF NOT EXISTS doctorsearchdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE doctorsearchdb;

CREATE TABLE IF NOT EXISTS doctors (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  speciality VARCHAR(255),
  location VARCHAR(255),
  experience_years INT,
  fee INT,
  rating_percent INT,
  patient_stories INT,
  available_today TINYINT(1),
  image_url VARCHAR(512),
  clinic VARCHAR(255),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- sample data
INSERT INTO doctors (name, speciality, location, experience_years, fee, rating_percent, patient_stories, available_today, image_url, clinic) VALUES
('Dr. Sheelavathi Natraj','Dermatologist','JP Nagar, Bangalore',21,800,94,1506,1,'https://via.placeholder.com/150','Sapphire Skin And Aesthetics Clinic'),
('Aesthetic Heart Dermatology & Cardiology Clinic','Dermatologist','Jayanagar, Bangalore',12,800,97,159,0,'https://via.placeholder.com/150','Aesthetic Heart'),
('Dr. Rahul Sharma','Dermatologist','JP Nagar, Bangalore',8,600,88,210,1,'https://via.placeholder.com/150','SkinCare Clinic'),
('Dr. Priya Menon','Pediatrician','Koramangala, Bangalore',10,700,91,340,1,'https://via.placeholder.com/150','Child Care Clinic');

