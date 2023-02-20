package org.shashank.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import java.util.Optional;

/*
@NoArgsConstructor will generate a constructor with no parameters.
If this is not possible (because of final fields), a compiler error will result instead,
unless @NoArgsConstructor(force = true) is used, then all final fields are initialized with
0 / false / null. For fields with constraints, such as @NonNull fields, no check is generated.

@RequiredArgsConstructor generates a constructor with 1 parameter for each field that requires special
handling. All non-initialized final fields get a parameter, as well as any fields that are marked as
@NonNull that aren't initialized where they are declared. For those fields marked with @NonNull,
an explicit null check is also generated. The constructor will throw a NullPointerException if any of the parameters intended for the fields marked with @NonNull contain null. The order of the parameters match the order in which the fields appear in your class.

@AllArgsConstructor generates a constructor with 1 parameter for each field in your class.
Fields marked with @NonNull result in null checks on those parameters.
 */
@Getter @AllArgsConstructor
public class Book {

    @NonNull
    private String title;
    @NonNull
    private String author;
    private Double price;

    public String getAuthorNote(){
        return String.format("The title is : %s, and The author is %s", title, author);
    }

    public double getCost(int quantity){
        return Optional.ofNullable(price)
                .map(p -> p * quantity)
                .orElseThrow(IllegalArgumentException::new);
    }
}
