import csv
from datetime import datetime
from random import randint, getrandbits
import time

ORDER_NUMBER_COUNTER = getrandbits(32)  # Initialize a counter with a random 32-bit number

def generate_order_no():
    global ORDER_NUMBER_COUNTER
    timestamp = datetime.now().strftime("%Y%m%d%H%M%S")
    sequence_number = ORDER_NUMBER_COUNTER
    ORDER_NUMBER_COUNTER += 1
    return f"SJO{timestamp}{sequence_number:013d}"

def create_order(user_id, amount):
    order = {
        'order_no': generate_order_no(),
        'user_id': user_id,
        'status': 0,  # Default status
        'amount': amount
    }
    return order

def save_orders_to_csv(count=2000):
    start_time = time.time()

    orders_data = []
    for _ in range(count):
        user_id = randint(1, 10000)
        amount = randint(1, 1000)
        order = create_order(user_id, amount)
        orders_data.append(order)

    with open('orders.csv', 'w', newline='', encoding='utf-8') as csvfile:
        fieldnames = ['order_no', 'user_id', 'status', 'amount']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

        writer.writeheader()
        for order in orders_data:
            writer.writerow(order)

    end_time = time.time()
    duration = end_time - start_time
    print(f"saveOrdersToCsv method execution time: {duration} seconds")

if __name__ == "__main__":
    save_orders_to_csv()