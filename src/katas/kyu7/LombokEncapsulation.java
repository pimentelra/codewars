package katas.kyu7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public @Data
class LombokEncapsulation {
    private int number;
    private String stringValue;
    private Object anObject;
}