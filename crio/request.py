# Import a library that allows to make HTTP request

import requests


# Set the API endpoint

url = " https://www.metaweather.com/api/location/2295424/"


# Use the library to perform the request

response = requests.request("GET", url)


# Print out the data
print(response.json()['consolidated_weather'][0]['weather_state_name'], "\n\n")
print(response.content)
