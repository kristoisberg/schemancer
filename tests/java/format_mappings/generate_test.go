package format_mappings_test

import (
	"testing"

	"github.com/Southclaws/schemancer/schemancer"
	"github.com/Southclaws/schemancer/schemancer/generators"
	"github.com/Southclaws/schemancer/schemancer/generators/java"
	"github.com/Southclaws/schemancer/schemancer/ir"
	"github.com/Southclaws/schemancer/schemancer/loader"
	"github.com/Southclaws/schemancer/tests/testutil"

	"github.com/stretchr/testify/require"
)

func TestFormatMappings(t *testing.T) {
	schema, err := loader.FromFile("schema.yaml")
	require.NoError(t, err, "failed to load schema")

	files, err := schemancer.Generate(schema, generators.GlobalOptions{
		Language: generators.LanguageJava,
		FormatTypeMapping: map[ir.IRFormat]generators.FormatTypeMapping{
			ir.IRFormat("user-id"): {
				Type:   "com.example.UserId",
				Import: "com.example.UserId",
			},
			ir.IRFormat("account-id"): {
				Type:   "com.example.AccountId",
				Import: "com.example.AccountId",
			},
		},
	}, java.WithPackageName("com.example.generated"))
	require.NoError(t, err, "failed to generate")

	testutil.WriteAndCompareMultipleFiles(t, files, "output", "expected")
}
