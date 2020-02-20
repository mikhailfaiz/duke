package duke;

import duke.tasks.TaskList;
import duke.util.Storage;
import duke.util.Ui;

public class Duke {
    private Storage storage;
    private TaskList tasks;
    private Ui ui;

    public Duke() {
        ui = new Ui();
        storage = new Storage();
        tasks = new TaskList(storage.load());
    }

    public void run() {
        ui.welcome();
        while (true) {
            String entry = ui.input();
            if (entry.equals("bye")) {
                ui.bye();
                break;
            }
            tasks.run(entry);
        }

    }

    public static void main(String[] args) {
        new Duke().run();
    }
}