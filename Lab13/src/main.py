import sqlite3
import function as f


def make_choose():
    value = int(input("Choose\n "
                      "1 for create table\n"
                      "2 for insert records\n"
                      "3 for select table\n"))
    menu(value)


def menu(value):
    if value == 1:
        f.create_table()

    elif value == 2:
        f.insert_date()

    elif value == 3:
        f.select_table()

    elif value == 4:
        f.delete_records()

    else:
        print("Incorrect value")


if __name__ == "__main__":
    make_choose()
