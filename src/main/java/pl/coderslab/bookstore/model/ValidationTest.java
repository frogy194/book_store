package pl.coderslab.bookstore.model;

import pl.coderslab.bookstore.validation.IsOverXYO;

public class ValidationTest {
    @IsOverXYO(10)
    public int yearOfBirth;
}
