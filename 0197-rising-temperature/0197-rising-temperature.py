
import pandas as pd

def rising_temperature(weather: pd.DataFrame) -> pd.DataFrame:
    weather = weather.sort_values('recordDate')

    previous_day = weather['recordDate'].shift(1)
    previous_temp = weather['temperature'].shift(1)

    result = weather[
        (weather['recordDate'] - previous_day == pd.Timedelta(days=1)) &
        (weather['temperature'] > previous_temp)
    ]

    return result[['id']]