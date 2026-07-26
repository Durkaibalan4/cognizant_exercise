import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
    return (
        <div>
            <CalculateScore
                name="Rahul"
                school="ABC School"
                total={450}
                goal={5}
            />
        </div>
    );
}

export default App;