
import lombok.*;


@Data
@TOSTRING
@EqualsAndHashCode
class DataDemo 
{
    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    protected String notes;
}

