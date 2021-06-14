# Creating a table into SQLite database

import sqlite3


def create_table():
    # Connect to sqlite database
    con = sqlite3.connect('../../database/db_cars.db')
    try:
        # Cursor object
        cur = con.cursor()
        # Execute query
        cur.execute('''CREATE TABLE Cars (
        CarId INTEGER PRIMARY KEY AUTOINCREMENT,
        CarMake TEXT (50) NOT NULL,
        CarModel TEXT (25) NOT NULL,
        Year INTEGER);''')
        # Commit changes
        con.commit()
        # Print successful message
        print('Car table is created successfully')
    except:
        print('Error occurred...')
        # Roll back if in case of issue
        con.rollback()
    # Close connection
    con.close()


def insert_date():
    con = sqlite3.connect('../../database/db_cars.db')

    query = "Insert into Cars (CarMake, CarModel, Year) values(?,?,?);"

    cars = [('BMW', 'E93', 2010), ('Mercedes', '450SL', 1973), ('Opel', 'Corsa', 2000)]

    try:
        cur = con.cursor()

        cur.executemany(query, cars)
        con.commit()
        print('Cars records are inserted successfullt')
    except:
        print('error')
        con.rollback()
    con.close()


def select_table():
    con = sqlite3.connect("../../database/db_cars.db")

    sql = "Select * from cars"

    cur = con.cursor()

    cur.execute(sql)
    while True:
        record = cur.fetchone()
        if record is None:
            break
        print(record)
    con.close()


def delete_records():

    con = sqlite3.connect('../../database/db_cars.db')
    qry = "Delete from Cars where CarMake=?;"
    try:

        cur = con.cursor()

        cur.execute(qry, ('Mercedes',))

        con.commit()

        print("Car record is deleted successfully")
    except:
        print("Error occurred...")

        con.rollback()

    con.close()