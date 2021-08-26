import SwiftUI
import shared

struct BookRow : View {
    var book: Book
    
    var body: some View {
        VStack(alignment: .leading) {
            Text(book.name)
                .foregroundColor(/*@START_MENU_TOKEN@*/.blue/*@END_MENU_TOKEN@*/)
                .fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
            Spacer()
            Text(book.desc)
                .foregroundColor(.red)
            Spacer()
            Text(book.author)
                .italic()
                .bold()
                .frame(maxWidth: .infinity, alignment: .trailing)
        }
    }
}

struct ContentView: View {
	let greet = Greeting().greeting()

	var body: some View {
        NavigationView {
            List(BookRepository().fetchBooks(), id: \.name) { book in
                BookRow(book: book)
            }.navigationBarTitle(Text("Books"))
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
	ContentView()
	}
}
