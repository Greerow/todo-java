package project.pp;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class pp {
    public static void main(String[] args) {

        // 1. Минск
        ZoneId minskZone = ZoneId.of("Europe/Minsk");

        ZonedDateTime originalEventTime = ZonedDateTime.of(
                2025, 6, 1, 12, 0, 0, 0, minskZone);

        // 2. Перевод в Instant (универсальное время)
        Instant instant = originalEventTime.toInstant();

        // 3. Токио
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime eventTimeTokyoZoned = instant.atZone(tokyoZone);

        // 4. Вывод
        System.out.println(originalEventTime);
        System.out.println(instant);
        System.out.println(eventTimeTokyoZoned);
    }
}
