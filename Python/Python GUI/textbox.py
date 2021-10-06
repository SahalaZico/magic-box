import tkinter as tk

# widget(Button, Checkbutton, Entry, Frame, Label, LabelFrame, Menubutton, PanedWindow, Radiobutton, Scale and Scrollbar)
from tkinter import ttk

win = tk.Tk()

win.title("Pengpro")

a_label = ttk.Label(win, text="Enter a Name:")
a_label.grid(column=0, row=0)


def click_me():
    action.configure(text='Hello ' + name.get())


name = tk.StringVar()
name_entered = ttk.Entry(win, width=12, textvariable=name)
name_entered.grid(column=0, row=1)
action = tk.Button(win, text="Click Me!", command=click_me)
action.grid(column=1, row=1)
win.mainloop()
