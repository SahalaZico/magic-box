import tkinter as tk
from tkinter import ttk
from tkinter import Menu

win = tk.Tk()
win.title("Antarmuka 2")


def _quit():
    win.quit()
    win.destroy()
    exit()


menu_bar = Menu(win)
win.configure(menu=menu_bar)

file_menu = Menu(menu_bar, tearoff=0)
file_menu.add_command(label="New")
file_menu.add_separator()
file_menu.add_command(label="Exit", command=_quit)
menu_bar.add_cascade(label="File", menu= file_menu)

help_menu = Menu(menu_bar, tearoff=0)
help_menu.add_command(label="About")
menu_bar.add_cascade(label="Help", menu= help_menu)

win.mainloop()