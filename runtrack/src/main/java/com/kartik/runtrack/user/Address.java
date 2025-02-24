package com.kartik.runtrack.user;

public record Address(
        String street,
        String suite,
        String city,
        String zipcode
) {
}
